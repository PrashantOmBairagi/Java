public static class GetterSetterMethods {
    private int rollNo;
    private String name;
    private String subject;

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    ////////////////////////////////////////////
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getSubject(){
        return subject;
    }
}

static void main() {
    GetterSetterMethods s1 = new GetterSetterMethods();
    s1.setRollNo(68);
    s1.setName("John");
    s1.setSubject("Science");

    System.out.println(s1.getRollNo());
    System.out.println(s1.getName());
    System.out.println(s1.getSubject());
}
