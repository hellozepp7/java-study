package 创建型设计模式.抽象工厂模式.checkboxes;

/**
 * <pre>
 * Description:
 *          windows系统的checkbox产品
 * @author Zepp Deng
 * @date 2021/1/7
 * </pre>
 */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        //TODO checkbox产品具体
        System.out.println("windows系统的checkbox产品");
    }

}
