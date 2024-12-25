package com.example.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.leibnix.BinaryTree;
@Service
public class BinaryTreeService {

    private static final Logger log = LogManager.getLogger(BinaryTreeService.class);

    public int getBinaryTreeHeight() {
        BinaryTree<String> b = new BinaryTree<String>();
        b.add("a");
        b.add("b");
        log.info("two items");

        return b.getHeight();
    }
    
}
