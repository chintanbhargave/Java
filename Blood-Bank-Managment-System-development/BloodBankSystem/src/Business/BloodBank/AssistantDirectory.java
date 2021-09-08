/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodBank;

import java.util.ArrayList;

/**
 *
 * @author chintanbhargave
 */
public class AssistantDirectory {

    ArrayList<Assistant> assistantDirectory;

    public AssistantDirectory() {
        this.assistantDirectory = new ArrayList();
    }

    public void addAssistantToDirectory(Assistant assistant) {
        assistantDirectory.add(assistant);
    }

    public ArrayList<Assistant> getAssistantDirectory() {
        return this.assistantDirectory;
    }
    
    public Assistant getAssistantById(int aId){
        for(Assistant a: assistantDirectory){
            if(a.getId() == aId){
                return a;
            }
        }
        return null;
    }
    
    public void removeAssistantFromDirectoryById(int aId){
        for(Assistant a: assistantDirectory){
            if(a.getId() == aId){
                assistantDirectory.remove(a);
            }
        }
    }
}
