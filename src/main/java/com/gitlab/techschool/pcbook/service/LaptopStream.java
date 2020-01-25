package com.gitlab.techschool.pcbook.service;

import com.gitlab.techschool.pcbook.pb.Laptop;

public interface LaptopStream {
    void Send(Laptop laptop);
}
