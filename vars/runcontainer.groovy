def call(Map params){  
        sshagent(['MServer2']) {
          sh "ssh -o StrictHostKeyChecking=no ubuntu@13.235.76.102 sudo docker run -p 3000:3001 --network=bridge --name ordermanagementcontainer atuljain1383/ordermanagement:v4"
    }
}
