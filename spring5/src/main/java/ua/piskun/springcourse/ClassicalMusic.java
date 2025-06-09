package ua.piskun.springcourse;

public class ClassicalMusic  implements Music {
    private ClassicalMusic(){};

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my Init Method");
    }

    public void doMyDestroy(){
        System.out.println("Doing my Destory Method");
    }

    @Override
    public String getSong() {
        return "Four Season";
    }
}
