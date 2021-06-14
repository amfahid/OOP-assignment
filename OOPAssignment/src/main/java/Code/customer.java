/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author fahid
 */
public class customer {
    private String email;
   private String Password;
   public customer(String email,String Password)
   {
       this.email=email;
       this.Password=Password;      
   }
   public String getemail()
   {
       return email;
   }
   public String getPassword()
   {
       return Password;
   }
   public void setPassword(String pass)
   {
       this.Password=pass;
   }
    public void setemail(String email)
   {
       this.email=email;
   }
}
