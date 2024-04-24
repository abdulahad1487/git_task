pipeline {
    agent any
    stages {
        stage("Build") {
            steps {
                echo "Building code using Maven..."
                
            }
        }
        stage("Unit and Integration Tests") {
            steps {
                echo "Running unit tests..."
                
                echo "Running integration tests..."
                
            }
        }
        stage("Code Analysis") {
            steps {
                echo "Running code analysis with SonarQube..."
                
            }
        }
        stage("Security Scan") {
            steps {
                echo "Performing security scan with OWASP ZAP..."
                
            }
        }
        stage("Deploy to Staging") {
            steps {
                echo "Deploying to staging server (AWS EC2 instance)..."
                
            }
        }
        stage("Integration Tests on Staging") {
            steps {
                echo "Running integration tests on staging environment..."
                
            }
        }
        stage("Deploy to Production") {
            steps {
                echo "Deploying to production server (AWS EC2 instance)..."
                
            }
        }
    }
    post {
        success {
            echo "Pipeline completed successfully!"
            mail to: "ahad1487281999@gmail.com",
            subject: "Pipeline Status - Success",
            body: "The pipeline completed successfully. Check attached logs for details.",
            attachmentsPattern: "**/*"
        }
        failure {
            echo "Pipeline failed :("
            mail to: "ahad1487281999@gmail.com",
            subject: "Pipeline Status - Failure",
            body: "The pipeline failed. Check attached logs for details.",
            attachmentsPattern: "**/*"
        }
    }
}
