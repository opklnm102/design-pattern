/**
 * 출처 - https://github.com/iluwatar/java-design-patterns/tree/master/lazy-loading
 * <p>
 * Created by ethan.kim on 2018. 5. 14..
 */
public class App {

    public static void main(String[] args) {
        // Simple lazy loader - not thread safe
        HolderNaive holderNaive = new HolderNaive();
        Heavy heavy = holderNaive.getHeavy();
        System.out.println("heavy= " + heavy);

        // Thread safe lazy loader, but with heavy synchronization on each access
        HolderThreadSafe holderThreadSafe = new HolderThreadSafe();
        Heavy another = holderThreadSafe.getHeavy();
        System.out.println("another= " + another);

        // The most efficient lazy loader utilizing Java 8 features
        Java8Holder java8Holder = new Java8Holder();
        Heavy next = java8Holder.getHeavy();
        System.out.println("next= " + next);
    }
}