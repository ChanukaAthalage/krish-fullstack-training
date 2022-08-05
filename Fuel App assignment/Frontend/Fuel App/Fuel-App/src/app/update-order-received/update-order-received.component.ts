import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Order } from '../order';
import { OrderService } from '../order.service';

@Component({
  selector: 'app-update-order-received',
  templateUrl: './update-order-received.component.html',
  styleUrls: ['./update-order-received.component.css']
})
export class UpdateOrderReceivedComponent implements OnInit {

  id!:number;
  orders!: Order[];
  constructor(private orderService: OrderService) { }

  ngOnInit(): void {
   // this.getOrderById();
  }

   getOrderById(){
    this.orderService.getOrderById(this.id).subscribe(data =>{
      this.orders = data;
      console.log(data);
    },
    error => console.log(error));
  }

  getOrderComplete(refId:number){
    this.orderService.getOrderComplete(refId,"Completed").subscribe(data =>{
      console.log(data);
      this.getOrderById();
    },
    error => console.log(error));
  }
  
  

}
