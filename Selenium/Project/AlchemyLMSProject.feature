
Feature: Alchemy LMS


  Scenario: Verify the website title
    Given User navigates to Alchemy Website
    #When User is on Alchemy Webpage
    And User verifies the webpage title 'Alchemy LMS – An LMS Application'
    And Close the open browser

  Scenario: Verify the website heading
    Given User navigates to Alchemy Website
    #When User is on Alchemy Webpage
    Then User verifies the webpage heading 'Learn from Industry Experts'
    And Close the open browser

  Scenario: Verify the title of the first info box
    Given User navigates to Alchemy Website
    #When User is on Alchemy Webpage
    Then User verifies title of first info box 'Actionable Training'
    And Close the open browser

  Scenario: Verify the title of the second most popular course
    Given User navigates to Alchemy Website
    #When User is on Alchemy Webpage
    Then User verifies title of second most popular course 'Email Marketing Strategies'
    And Close the open browser

  Scenario: Navigate to another page
    Given User navigates to Alchemy Website
    #When User is on Alchemy Webpage
    Then User clicks 'My Account' Option
    And User verifies title of new page 'My Account - Alchemy LMS'
    And Close the open browser

  Scenario: Logging into the site
    Given User navigates to Alchemy Website
    #When User is on Alchemy Webpage
    Then User clicks 'My Account' Option
    And User verifies title of new page 'My Account - Alchemy LMS'
    And User clicks on Login button
    And User enters User Name in User name field
    And User enters password in password field
    And User clicks on Login button on login page
    And Close the open browser

  Scenario: Count the number of courses
    Given User navigates to Alchemy Website
    #When User is on Alchemy Webpage
    Then User clicks on all courses link
    And User prints count of all courses displayed
    And Close the open browser

  Scenario: Contact the admin
    Given User navigates to Alchemy Website
    #When User is on Alchemy Webpage
    Then User clicks on contact link
    And User fills all details in the form displayed
    And user clicks on submit
    And user prints message displayed after submission
    And Close the open browser

  Scenario: Complete a simple lesson
    Given User navigates to Alchemy Website
    #When User is on Alchemy Webpage
    And User clicks 'My Account' Option
    And User clicks on Login button
    And User enters User Name in User name field
    And User enters password in password field
    And User clicks on Login button on login page
    Then User clicks on all courses link
    And User selects any course on page and opens it
    And User selects any lesson inside the course and verifies course heading
    And user completes a course by clicking on mark complete
    And Close the open browser


