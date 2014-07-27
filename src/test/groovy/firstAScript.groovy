txtFields = fxer.getAll( 'type:TextField' )
assert txtFields && txtFields.size() >= 2
clickOn txtFields[0]
enterText 'Renato Athaydes'
clickOn txtFields[1]
enterText 'renato@athaydes.com'
clickOn 'type:TextArea'
type 'A comment from an Automaton script'
clickOn 'text:OK'

assertThat fxer['status-label'], hasText( 'Completed!' )

println 'Test PASSED!'
