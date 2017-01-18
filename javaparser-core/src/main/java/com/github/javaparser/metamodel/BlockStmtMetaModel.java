package com.github.javaparser.metamodel;

import java.util.Optional;

public class BlockStmtMetaModel extends ClassMetaModel {

    BlockStmtMetaModel(JavaParserMetaModel parent, Optional<ClassMetaModel> superClassMetaModel) {
        super(superClassMetaModel, parent, com.github.javaparser.ast.stmt.BlockStmt.class, "BlockStmt", "com.github.javaparser.ast.stmt.BlockStmt", "com.github.javaparser.ast.stmt", false);
        fieldMetaModels.add(new FieldMetaModel(this, "getStatements", "setStatements", "statements", int.class, null, true, false, true, false));
    }
}

