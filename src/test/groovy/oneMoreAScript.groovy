clickOn 'text:Cancel'

assertThat fxer['status-label'], hasText('You cancelled')

println 'Test 2 PASSED'
