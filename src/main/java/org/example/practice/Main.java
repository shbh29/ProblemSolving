package org.example.practice;

import java.util.*;

class BlogPost {
    String title;
    String author;
    BlogPostType type;
    int likes;

    public BlogPost(String title, String author, BlogPostType type, int likes) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BlogPostType getType() {
        return type;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogPost blogPost = (BlogPost) o;
        return likes == blogPost.likes && Objects.equals(title, blogPost.title) && Objects.equals(author, blogPost.author) && type == blogPost.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, type, likes);
    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", type=" + type +
                ", likes=" + likes +
                '}';
    }
}

enum BlogPostType {
    NEWS,
    REVIEW,
    GUIDE
}

class Tuple {
    BlogPostType type;
    String author;

    public Tuple(BlogPostType type, String author) {
        this.type = type;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple tuple = (Tuple) o;
        return type == tuple.type && Objects.equals(author, tuple.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, author);
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "type=" + type +
                ", author='" + author + '\'' +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
        List<BlogPost> list = Arrays.asList(
                new BlogPost("title1", "author1", BlogPostType.NEWS, 50),
                new BlogPost("title4", "author4", BlogPostType.GUIDE, 45),
                new BlogPost("title2", "author2", BlogPostType.REVIEW, 52),
                new BlogPost("title6", "author6", BlogPostType.NEWS, 500),
                new BlogPost("title7", "author7", BlogPostType.GUIDE, 450),
                new BlogPost("title8", "author8", BlogPostType.REVIEW, 200),
                new BlogPost("title8", "author8", BlogPostType.REVIEW, 200),
                new BlogPost("title3", "author3", BlogPostType.GUIDE, 55)
        );

//        Map<BlogPostType, List<BlogPost>> groupByType = list.stream().collect(Collectors.groupingBy(BlogPost::getType));


//        groupByType.entrySet().stream()
//                .map(e -> {
//                    return Map.entry(e.getKey(), e.getValue().stream().map(bp -> bp.getAuthor())
//                                    .sorted(Comparator.reverseOrder())
//                            .collect(Collectors.toList()));
//                })
//                .peek(e -> System.out.println(e.getKey()))
//                .map(e -> e.getValue())
//                .forEach(System.out::println);

//        groupByType.entrySet().stream()
//                .flatMap(e -> e.getValue().stream().map(bp -> bp.getAuthor()))
//                .forEach(System.out::println);

//        list.stream().collect(Collectors.groupingBy(post -> new Tuple(post.getType(), post.getAuthor())))
//                .entrySet()
//                .stream()
//                .peek(e -> System.out.println(e.getKey()))
//                .forEach(e -> System.out.println(e.getValue()));

        //then comparing use.
//        list.stream().forEach(bp -> System.out.println(bp.getAuthor()+" "+bp.getType()+" "+bp.getLikes()));
//
//        System.out.println("----");
//        list.stream()
//                .sorted(Comparator.comparing(BlogPost::getType).thenComparing(BlogPost::getLikes, Comparator.reverseOrder()))
//                .forEach(bp -> System.out.println(bp.getAuthor()+" "+bp.getType()+" "+bp.getLikes()));

//        ExecutorService executorService;
//        executorService.execute();

    }
}