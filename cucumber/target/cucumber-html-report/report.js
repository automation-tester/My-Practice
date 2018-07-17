$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TagsAndHooks.feature");
formatter.feature({
  "line": 1,
  "name": "Gmail login page with tags and hooks",
  "description": "",
  "id": "gmail-login-page-with-tags-and-hooks",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "user checks the login page functionality using scenario outline",
  "description": "",
  "id": "gmail-login-page-with-tags-and-hooks;user-checks-the-login-page-functionality-using-scenario-outline",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user enters \"\u003cusername\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "clicks on next link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cpassword\u003e\" password",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "gmail-login-page-with-tags-and-hooks;user-checks-the-login-page-functionality-using-scenario-outline;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "gmail-login-page-with-tags-and-hooks;user-checks-the-login-page-functionality-using-scenario-outline;;1"
    },
    {
      "cells": [
        "onlinedatauser10",
        "Gkgs@1992"
      ],
      "line": 11,
      "id": "gmail-login-page-with-tags-and-hooks;user-checks-the-login-page-functionality-using-scenario-outline;;2"
    },
    {
      "cells": [
        "harishyed91@gmail.com",
        "bhagyamma"
      ],
      "line": 12,
      "id": "gmail-login-page-with-tags-and-hooks;user-checks-the-login-page-functionality-using-scenario-outline;;3"
    }
  ],
  "keyword": "Examples"
});
});