import { Component, OnInit } from '@angular/core';
import { Order } from '../order';
import { OrderService } from '../order.service';

@Component({
  selector: 'app-add-order',
  templateUrl: './add-order.component.html',
  styleUrls: ['./add-order.component.css']
})
export class AddOrderComponent implements OnInit {

  order:Order = new Order();
  constructor(private orderService:OrderService,) { }

  ngOnInit(): void {
  }

  addOrder(){
    this.orderService.addOrder(this.order).subscribe(data => {
      console.log(this.order);
    },
    error => console.log(error))
    
  }

  realodPage(){
    location.reload();
  }

}
