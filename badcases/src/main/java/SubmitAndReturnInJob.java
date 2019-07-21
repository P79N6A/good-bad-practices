/**
 *
 * 有时候，在一些场景不能简单的往线程池中丢任务：
 *
 * 1、将任务丢到线程池 -> 线程池中跑任务，做一些数据操作
 * 2、后续的逻辑依赖这些数据，产生数据竞争
 *
 * 解决方案：
 * 1）利用countdown latch或者 semopho
 *
 * @author 张义 reed.zy@alibaba-inc.com
 */
public class SubmitAndReturnInJob {


}
