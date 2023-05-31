<<<<<<< HEAD
=======

>>>>>>> 33eec5658955181170cff45399c0f57ed418719b
Feature: Retail Home Page

  Background: 
    Given User is on retail website
    When User click on All section
<<<<<<< HEAD

  @homePage @Regression
  Scenario: Verify Shop by Department sidebar
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @homePage @Regression
=======
@homePage @Regression
  Scenario: Verify Shop by Department sidebar
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |
@homePage @Regression
>>>>>>> 33eec5658955181170cff45399c0f57ed418719b
  Scenario Outline: Verify department sidebar options
    And User is on 'Electronics'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automotive  | Automative Parts & Accessories | MotorCycle & Powersports |
