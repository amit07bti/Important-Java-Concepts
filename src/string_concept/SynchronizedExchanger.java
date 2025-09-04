package string_concept;

public class SynchronizedExchanger {

    protected  Object object= null;


    public synchronized void setObject(Object o){
     this.object=o;
        System.out.println(o);

    }
    public synchronized  Object getObject(){
        System.out.println(object);
        return this.object;
    }

    public void setObj(Object o){
        synchronized (this){
            this.object=o;
        }

    }
    public  Object getObj(){
        synchronized (this){
            return  this.object;
        }
    }
}
