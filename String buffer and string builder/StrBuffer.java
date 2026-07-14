public class StrBuffer{
    public static void main(String[] args){
        // System.out.println("hello");
        // StringBuffer is mutable
        // String name="kathir";
        // System.out.println(name.hashCode());
        // name="vel";
        // System.out.println(name.hashCode());
        // StringBuffer sb=new StringBuffer("");

        // string buffer is thread safe 
        // all methods are synchronized methods 
        // but string builder is not 


        // System.out.println(sb.hashCode());
        // sb.append("helloo");
        // System.out.println(sb.hashCode());
        
       
        
        StringBuilder sbuild=new StringBuilder("hello");
        System.out.println(sbuild.hashCode());
        sbuild.append("world");
        System.out.println(sbuild.hashCode());
        System.out.println(sbuild);
    }
}