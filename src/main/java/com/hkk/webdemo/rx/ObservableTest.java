package com.hkk.webdemo.rx;

import com.google.common.collect.Lists;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ObservableTest {

    private static String rpc(String name) {
        try {
            TimeUnit.SECONDS.sleep(3);
            System.out.println(name);
        } catch (Exception e) {

        }
        return "rpc:" + name;
    }

    public static void main(String[] args) throws InterruptedException {
        Observable<Object> observable = Observable.create(observer -> {
            observer.onNext("处理的数字是：" + Math.random());
            observer.onComplete();
        });

        observable.subscribe(consumer -> {
            System.out.println("我处理的元素是：" + consumer);
        });

        observable.subscribe(consumer -> {
            System.out.println("我处理的元素是：" + consumer);
        });

        System.out.println(Long.valueOf("0023"));

        List<String> names = Lists.newArrayList("1", "2");
        Flowable.fromArray(names.toArray(new String[0]))
            .flatMap(name -> Flowable.just(name).observeOn(Schedulers.io()).map(n -> rpc(n)))
            .subscribe(System.out::println);
        TimeUnit.SECONDS.sleep(10);
        System.out.println("main 执行完成");
    }

}
