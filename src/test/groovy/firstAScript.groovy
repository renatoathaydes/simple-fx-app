txtFields = fxer.getAll( 'type:TextField' )
assert txtFields && txtFields.size() >= 2
clickOn txtFields[0]
waitForFxEvents()

enterText 'Renato Athaydes'
clickOn txtFields[1]
waitForFxEvents()

enterText 'renato@email.com'
clickOn 'type:TextArea'
waitForFxEvents()

type 'A comment from an Automaton script'
clickOn 'text:OK'
waitForFxEvents()

assertThat fxer['status-label'], hasText(
        'Name: Renato Athaydes, Email: renato@email.com, Comments: A comment from an Automaton script' )

println 'Test PASSED!'
