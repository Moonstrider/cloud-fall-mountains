package com.cloud.fall.mountains.notebook.completable.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {

    public static String combine(String a, String b) {
        return a + b;
    }

    public static String compute() {
        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
            System.out.println("shit");
            return "shit";
        }).thenCombine(CompletableFuture.supplyAsync(() -> {
            System.out.println("fuck");
            return "fuck";
        }), CompletableFutureTest::combine);

        return cf.join();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        System.out.println("123");
//        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
//        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "World!");
//        CompletableFuture<String> combinedFuture = future1.thenCombine(future2,
//            (s1, s2) -> s1 + " " + s2);
//        System.out.println("456");
//        combinedFuture.thenAccept(System.out::println);
//        System.out.println("789");

        String compute = compute();
        System.out.println(compute);

        CompletableFuture<String> cf = CompletableFuture.completedFuture("message");
        System.out.println(cf.isDone());
        System.out.println(cf.getNow(null));
        System.out.println(cf.get());

        StringBuilder result = new StringBuilder();
        CompletableFuture.completedFuture("thenAccept message")
            .thenAccept(result::append);
        System.out.println(result);

        CompletableFuture<Void> c1 = CompletableFuture.completedFuture("thenAcceptAsync message")
            .thenAcceptAsync(result::append);
        c1.join();
        System.out.println(result);

    }

}
