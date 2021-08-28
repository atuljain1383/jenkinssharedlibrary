def call(Map params){  
    sshagent(["${params.server}"]) {
      echo "sudo docker run -d -p 3000:3001 --network=Bridge --name ordermanagementcontainer atuljain1383/ordermanagement:v4"
    }
}
