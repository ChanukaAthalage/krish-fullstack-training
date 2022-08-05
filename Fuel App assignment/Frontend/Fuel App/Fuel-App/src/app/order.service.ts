import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Order } from './order';

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  private baseURL = "http://localhost:8080/api/v1/orders";
  constructor(private httpClient:HttpClient) { }

  getAllOrders():Observable<Order[]>{
    return this.httpClient.get<Order[]>(`${this.baseURL}`);
  }

  addOrder(order:Order):Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`,order);
  }

  getOrderById(id:number): Observable<Order[]>{
    return this.httpClient.get<Order[]>(`${this.baseURL}/${id}`);
  }

  getOrderComplete(id:number,status:string){
    return this.httpClient.put(`${this.baseURL}/${id}/${status}`,"");
}

}
