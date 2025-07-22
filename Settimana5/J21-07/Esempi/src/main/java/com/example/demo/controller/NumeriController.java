/*
 * aggiungere
 * numeri a un array con la post, vedere la lista di numeri,
 * vedere la somma totale dei numeri, rimuovere dei numeri
 * 
 * oggetti id / numero
 */

package com.example.demo.controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/numbers_request")
public class NumeriController
{
    // private ArrayList<Integer> nums;
    private ArrayList<Integer> nums = new ArrayList<>();

    // public Numeri()
    // {
    //     nums = new ArrayList<>();
    // }

    @PostMapping("/add")
    public int addNumber(@RequestBody int numToAdd)
    {
        nums.add(numToAdd);
        // return "Number "  + numToAdd + " added to the list";
        return nums.getLast();
    }

    @GetMapping("/get_numbers_list")
    public String getNumbers()
    {
        String res = "Number list: ";

        for(int i = 0; i < nums.size(); i++)
        {
            //adds number to the list
            res += nums.get(i);

            if(i != nums.size() - 1)
            {
                //number separator.
                //Only if it's not the last number in the list
                res += ", ";
            }
        }

        return res;
    }

    @GetMapping("/get_numbers_sum")
    public String getNumbersSum()
    {
        int sum = 0;

        for (int num : nums)
        {
            //adds each number to the "sum" variable
            sum += num;
        }

        return "The sum of all numbers is: " + sum;
    }

    @DeleteMapping("/del/{numToDelete}")
    public String deleteNum(@PathVariable int numToDelete)
    {
        //tries to remove the number
        if(nums.removeIf(n -> n.equals(numToDelete)))
        {
            return "Number " + numToDelete + " deleted successfully";
        }

        return "The number " + numToDelete + " is not present in the list";
    }
}
