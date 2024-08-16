// write a java program
// Consider The Research and Analysis Wing(RAW) is the foreign intelligence
// agency of India.
// It is under the authority of the Prime Minister of India without
// parliamentary oversight.
// Secretary reports to the National Security Adviser on a daily basis including
// new tasks to be performed.
// Create a "RAWAgent" class which will have complete details of RAW agents
// information such as
// RawAgentBatchId, RawAgentCodeName, RawAgentMissionName which are highly
// confidential information
// 1) Create "IndianSecretUnit" to control all the RAW agents.
// 2).Allow "IndianSecretUnit" to have atleast 5 RAWAgents.
// 3).Make sure IndianSecretUnit to assign new-tasks to RAW agents by changing
// their details
// into new Mission.
// 4).Print all the RAW agents details assigned before then modify the details
// for new Mission and allow IndianSecretUnit print updated details.
// Note.
// 1. Initialize all the information using constructor.
// 2. take input from user.

import java.util.Scanner;

/**
 * RAWAgent
 */
class RAWAgent {

     private String rawAgentBatchId;
     private String rawAgentCodeName;

     private String rawAgentMissionName;

     public RAWAgent(String rawAgentBatchId, String rawAgentCodeName, String rawAgentMission) {
          this.rawAgentBatchId = rawAgentBatchId;
          this.rawAgentCodeName = rawAgentCodeName;
          this.rawAgentMissionName = rawAgentMission;
     }

     public String getRawAgentBatchId() {
          return rawAgentBatchId;
     }

     public void setRawAgentBatchId() {
          this.rawAgentBatchId = rawAgentBatchId;
     }

     public String getRawAgentCodeName() {
          return rawAgentBatchId;
     }

     public void setRawAgentCodeName() {
          this.rawAgentCodeName = rawAgentCodeName;
     }

     public String getRawAgentMissionName() {
          return rawAgentMissionName;
     }

     public void setRawAgentMission() {
          this.rawAgentMissionName = rawAgentMissionName;
     }

}

public class IndianSecretUnit {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Batch Id : ");
          String batchId = sc.nextLine();
          System.out.print("Code Name : ");
          String codeName = sc.nextLine();
          System.out.print("Mission Name : ");
          String missionName = sc.nextLine();

          RAWAgent rawAgent1 = new RAWAgent(batchId, codeName, missionName);
          RAWAgent rawAgent2 = new RAWAgent(batchId, codeName, missionName);
          RAWAgent rawAgent3 = new RAWAgent(batchId, codeName, missionName);
          RAWAgent rawAgent4 = new RAWAgent(batchId, codeName, missionName);
          RAWAgent rawAgent5 = new RAWAgent(batchId, codeName, missionName);
          System.out.println();
          System.out.println("RAW Agent Details Before Modification");
          System.out.println();
          System.out.println("Batch Id : " + rawAgent1.getRawAgentBatchId());
          System.out.println("Code Name : " + rawAgent1.getRawAgentCodeName());
          System.out.println("Mission Name : " + rawAgent1.getRawAgentMissionName());
          System.out.println();
          System.out.println("Batch Id : " + rawAgent2.getRawAgentBatchId());
          System.out.println("Code Name : " + rawAgent2.getRawAgentCodeName());
          System.out.println("Mission Name : " + rawAgent2.getRawAgentMissionName());
          System.out.println();
          System.out.println("Batch Id : " + rawAgent3.getRawAgentBatchId());
          System.out.println("Code Name : " + rawAgent3.getRawAgentCodeName());
          System.out.println("Mission Name : " + rawAgent3.getRawAgentMissionName());
          System.out.println();
          System.out.println("Batch Id : " + rawAgent4.getRawAgentBatchId());
          System.out.println("Code Name : " + rawAgent4.getRawAgentCodeName());
          System.out.println("Mission Name : " + rawAgent4.getRawAgentMissionName());
          System.out.println();
          System.out.println("Batch Id : " + rawAgent5.getRawAgentBatchId());
          System.out.println("Code Name : " + rawAgent5.getRawAgentCodeName());
          System.out.println("Mission Name : " + rawAgent5.getRawAgentMissionName());

     }
}
