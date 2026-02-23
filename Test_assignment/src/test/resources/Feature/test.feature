#Author:Suma
Feature: Language Selection on Times of India website
Scenario:Select telugu language

Given user open the times of India website "https://timesofindia.indiatimes.com/" 
When wait for the page to load
And select telugu language from the dropdown using relative XPath
Then the language should be changed to telugu