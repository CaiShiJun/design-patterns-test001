package org.github.caishijun.flyweight_022.a_simple_flyweight;

import java.util.HashMap;
import java.util.Map;


/**
 * 定义一个FlyweightFactory（享元工厂类）：
 */


/**
 * 享元工厂
 * FlyweightFactory（享元工厂类）：创建并管理享元对象，享元池一般设计成键值对
 */
public class ChessFlyWeightFactory {
    //享元池：存放享元对象
    private static Map<String,ChessFlyWeight> map = new HashMap<String,ChessFlyWeight>();
    //提供一个享元工厂:创建和管理棋子
    public static ChessFlyWeight getChess(String color){
        if (map.get(color) != null ) {
            return map.get(color);
        }else{
            ChessFlyWeight chess = new concreteFlyWeight(color);
            map.put(color, chess);
            return chess;
        }
    }
}
