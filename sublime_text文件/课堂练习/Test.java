public class Test{

        String name;
    
        public void say(String a,int b){
        System.out.println("Hello world");
 }

    //程序的入口方法，和具体类无关
    public static void main(String[] args){
    Test t =new Test();
     t.say("袁旺",21);
     //得到当前的类加载器AppClassLoader
    ClassLoader cl = Test.class.getClassLoader();
    System.out.println(cl);

   //得到AppClassLoader的父类加载器ExtClassLoader
   ClassLoader extcl = cl.getParent();
   System.out.println(extcl);
   
   
   ClassLoader bootCl = extcl.getParent();
   System.out.println(bootCl);

	}

}
