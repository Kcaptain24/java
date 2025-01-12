git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"

git clone https://github.com/your-username/mock-company-webapp.git

cd mock-company-webapp

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // TODO: Add build steps
                sh './gradlew assemble'
            }
        }
        stage('Test') {
            steps {
                // TODO: Add test steps
                sh './gradlew test'
            }
        }
    }
}

name: CI

on:
  push:
    branches:
      - '**'

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - name: Checkout repository
        uses: actions/checkout@v2
      - name: Set up JDK 11
        uses: actions/setup-java@v2
        with:
          java-version: '11'
      - name: Build with Gradle
        run: ./gradlew assemble
      - name: Test with Gradle
        run: ./gradlew test


public List<String> search(String query) {
    // TODO: Replace with actual search logic
    return Collections.emptyList();
}

git add .
git commit -m "Modified SearchService to break tests"
git push origin main
