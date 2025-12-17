class Ra
{
    private String name;
    private String password;
    void setName(String n)
    {
        this.name=n;
    }
    void setpassword(String p)
    {
        if(p.length()>=8)
        {
        this.password=p;
        }
         
        
    }
    String getName()
    {
        return name;
    }
    String getPassword()
    {
        if (password==null)
        {
            return "key must atlest 8 characters";
        }
        return password;
       
    }
    public static void main(String[] args){
        Ra r=new Ra();
        r.setName("raju");
        r.setpassword("raju5678");
        System.out.println(r.getName());
        System.out.println(r.getPassword());
    }
}