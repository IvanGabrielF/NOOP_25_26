package pckg_wildcards;

import java.util.ArrayList;
import java.util.List;

public class MultiListCLS<E> {
    private final List<E> someList;





    public MultiListCLS() {
        this.someList = new ArrayList<>();
    }
    public MultiListCLS(List<E> someList){
        this.someList = someList;
    }

    public void listElementsInList(){
        if (someList.isEmpty()){
            System.out.println("List is empty");
        }else {
            someList.forEach(System.out::println);
        }
    }

    public void addElementToList(E element){
        if (someList.contains(element)){
            System.out.println("Element already in list!");
        }else {
            someList.add(element);
            System.out.println("Element added to list!");
        }
    }

    public void compareListLenghts(List<?> anotherList){
        if(someList.size() > anotherList.size()){
            System.out.println("This list is longer than another list!");
        }else if(someList.size() < anotherList.size()){
            System.out.println("Another one is longer!");
        }else {
            System.out.println("Same number of elements!");

        }
    }

}
