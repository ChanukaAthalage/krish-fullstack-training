import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddOrderComponent } from './add-order/add-order.component';
import { AllOrdersComponent } from './all-orders/all-orders.component';
import { CheckOrdersComponent } from './check-orders/check-orders.component';
import { DispatchComponent } from './dispatch/dispatch.component';
import { UpdateOrderReceivedComponent } from './update-order-received/update-order-received.component';

const routes: Routes = [
  {path: 'allorders', component: AllOrdersComponent},
  {path: '', redirectTo: 'addorder', pathMatch: 'full'},
  {path: 'addorder', component: AddOrderComponent},
  {path: 'getorderscomplete', component: UpdateOrderReceivedComponent},
  {path: 'getorders', component: CheckOrdersComponent},
  {path: 'dispatch', component: DispatchComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
