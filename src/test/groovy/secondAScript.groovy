clickOn 'text:Cancel'
waitForFxEvents()

assertThat fxer['status-label'], hasText('You cancelled')

println 'Test PASSED!'
