#!groovy
@Library('mysharedlibs@main') _
 


def call(hosts){
def tools = new org.cicd.tools()
//tools指代的是src/org/devops/tools.groovy脚本文件

def ansible = new org.cicd.ansible()

pipeline
{
     agent {  label "master"  }
     
     stages{
         stage("build"){
           steps {
              script {
             
                ansible.AnsibleDeploy("127.0.0.1","-m ping")      
                 
              }
            }
         }
     }
     
     
   post {
        always {
             script{
                  tools.PrintMes("1.1.1.1")
             }
        }
   }     
}
}
