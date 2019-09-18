	pipeline {
	    agent any
	    stages {
		stage ('Compile Stage') {
		    steps {
		       sh 'git checkout master'
		       sh 'echo "Compile"'
		       sh 'echo $NODE_NAME '
		       sh 'javac src/Main.java'
		       // TODO: Add statements to commit to github repository
		       // sh 'git commit -am "Updated version number"'
		       // sh 'git push origin master'
		       // Add statements to push build to some repo
		    }
		}

		stage ('Testing Stage') {

		    steps {
		       sh 'echo "Testing"'
		       //Add Testing statements to test
		       cd src
		       sh 'java Main'
		    }
		}


		stage ('Deployment Stage') {
		    steps {
		      sh 'echo "Deployment"'
		      // TO DO : Add deployment steps
		      // Cleanup
		    }
		}
	    }
	}
