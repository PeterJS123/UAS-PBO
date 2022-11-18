/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_PBO.Model;

public class Member extends User{
    
    private static Member memberInst;
    private String username;

    public Member() {
    }

    public Member(String username, String email, String password) {
        super(email, password);
        this.username = username;
    }

    public static Member getMemberInst(){
        if(memberInst==null){
            memberInst = new Member();
            System.out.println("Member instance created for the first time.");
        }
        return memberInst;
    }
    
    public void deleteMemberInstance(){
        memberInst = null;
        System.out.println("Member instance deleted.");
    }
    

    public String getUsername() {
        return username;
    }

    public void setUSername(String phoneNumber) {
        this.username = username;
    }
    
    
}
