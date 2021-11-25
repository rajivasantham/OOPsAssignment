package polymorphism;

public class Polymorphism2 {
    public void add(int a,int b){
        System.out.println("The sum is:"+ (a+b));
    }

    public static class Polymorphism {
        public void getLargest(int a,int b){

            if(a>b){
                System.out.println(" The largest number is :"+a);
            }else{
                System.out.println("The largest number is :"+b);
            }
        }
        public void getLargest(int a[]){
            int temp=0;
            for(int i=0;i<a.length;i++){
                for (int j=i+1;j<a.length;j++){
                    if(a[i]<a[j]){
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }

                }


            }
            System.out.println("the largest number is:"+a[0]);




        }

        public static void main(String[] args) {
            Polymorphism pe=new Polymorphism();
            pe.getLargest(2,3);
            pe.getLargest(new int[]{500,700,800});
        }
    }
}
