package action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;


public class SwiftFormatAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {

        Editor editor = e.getData(PlatformDataKeys.EDITOR);
        final Document doc = editor.getDocument();

        String content = doc.getText();

        System.out.println(content);


        // 目前仍然是 2.2 的语法 https://github.com/antlr/grammars-v4/blob/master/swift/Swift.g4
//        // 记法分析
//        SwiftLexer lexer = new SwiftLexer(new ANTLRInputStream(content));
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//
//        // 语法分析
//        SwiftParser parser = new SwiftParser(tokens);
//        ParseTree tree = parser.initializer();
//
//        // 遍历语法树
//        SwiftBaseVisitor visitor = new SwiftBaseVisitor();
//        visitor.visit(tree);
//
//        System.out.println(visitor);
    }
}
