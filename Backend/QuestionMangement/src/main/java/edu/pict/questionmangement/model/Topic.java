package edu.pict.questionmangement.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String topic;

    @ManyToMany(mappedBy = "topics")
    private List<Question> questions = new ArrayList<>();

    public Topic(String topic) {
        this.topic = topic;
    }
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
