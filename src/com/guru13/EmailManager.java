package com.guru13;

import com.guru13.model.EmailAccount;
import javafx.scene.control.TreeItem;

/**
 * @author Aliaksei Huryanchyk
 */
public class EmailManager {

    //Folder handling:
    private TreeItem<String> foldersRoot = new TreeItem<String>();

    public TreeItem<String> getFoldersRoot() {
        return foldersRoot;
    }

    public void addEmailAccount(EmailAccount emailAccount) {
        TreeItem<String> treeItem = new TreeItem<String>(emailAccount.getAddress());
        treeItem.setExpanded(true);
        treeItem.getChildren().add(new TreeItem<String>("INBOX"));
        treeItem.getChildren().add(new TreeItem<String>("Sent"));
        treeItem.getChildren().add(new TreeItem<String>("Folder1"));
        treeItem.getChildren().add(new TreeItem<String>("Spam"));
        foldersRoot.getChildren().add(treeItem);
    }

}