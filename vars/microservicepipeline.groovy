def call(Map params) {
  pipeline{
      agent any
      stages{
          stage("Checkout"){
              steps{
                gitcheckout([branch: ${params.branchname}, giturl: ${params.giturl}])
              }
          }
          stage("Build Image"){             
              steps{
                  dir(${params.jenkinsdir}) {
                      script{
                              builddockerimage([imagename: ${params.imagename}])
                      }
                  }                    
              }
          }
          stage("Push Image"){
              steps{
                 pushdockerimage([username: ${params.dockerhubuserid}, password: ${params.dockerhubpassword}, imagename: ${params.imagename}])
             }  
          }        
      }
  }
}
