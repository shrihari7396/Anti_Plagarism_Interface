package edu.pict.ecommerce.questionmangement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "topics")
    private List<Question> questions = new ArrayList<>();
}

/*
    Array,
    String,
    LinkedList,
    Stack,
    Queue,
    HashTable,
    Heap,              // Priority Queue / Min/Max Heap
    Tree,
    BinaryTree,
    BinarySearchTree,
    Graph,
    Matrix,
    Recursion,
    Backtracking,
    SlidingWindow,
    TwoPointers,
    DepthFirstSearch,
    BreadthFirstSearch,
    BinarySearch,
    Sorting,
    Greedy,
    DynamicProgramming,
    BitManipulation,
    UnionFind,
    Trie,
    SegmentTree,
    FenwickTree,
    MonotonicStack,
    TopologicalSort;
 */
