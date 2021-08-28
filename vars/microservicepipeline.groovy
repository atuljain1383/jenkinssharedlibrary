def call(Map pipelineParams) {
  pipeline{
      agent any
      stages{
          stage("Checkout"){
              steps{
                gitcheckout([branch: "master", giturl: "https://github.com/atuljain1383/apis.git"])
              }
          }
          stage("Build Image"){             
              steps{
                  dir("/var/lib/jenkins/workspace/OrderManagemenService/services/ordermanagement") {
                      script{
                              builddockerimage([imagename: "atuljain1383/ordermanagement:v3"])
                      }
                  }                    
              }
          }
          stage("Push Image"){
              steps{
                 pushdockerimage([username: "atuljain1383", password:"Ishika@2sep", imagename: "atuljain1383/ordermanagement:v3"])
             }  
          }        
      }
  }
}
