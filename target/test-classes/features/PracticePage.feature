Feature: Validate Elements in Practice Page
  @homepage
  Scenario: validate home page landing
	Given I navigate to "https://learn.letskodeit.com/" url
	Then I validate enrollNow is displayed
	And I validate home image source is "https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=height:60/https://www.filepicker.io/api/file/WSundQ6BT6u2OZe2kcNA"
	#And I validate home image source is "https://process.fs.teachablecdn.com"

  @practicepage
  Scenario: Validate Radio buttons, Checkboxes and Selections
	Given I navigate to "https://learn.letskodeit.com/" url
	When I click on Practice
	Then I select BMW radio button
	And I select honda from cars dropdown


	