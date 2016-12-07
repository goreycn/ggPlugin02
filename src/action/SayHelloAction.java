package action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;
import componet.MyComponent;

/**
 * Created by Grubby on 2016/12/06 22:33.
 */
public class SayHelloAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        Application application = ApplicationManager.getApplication();

        MyComponent myComponent = application.getComponent(MyComponent.class);

        myComponent.sayHello();
    }
}
