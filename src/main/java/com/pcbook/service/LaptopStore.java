package com.pcbook.service;

import com.pcbook.pb.Filter;
import com.pcbook.pb.Laptop;

public interface LaptopStore {
    void Save(Laptop laptop) throws Exception;
    Laptop Find(String id);

    void Search(Filter filter, LaptopStream stream);

}
