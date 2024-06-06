import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListaClientesComponent } from './components/lista-clientes/lista-clientes.component';
import { CreateClienteComponent } from './components/create-cliente/create-cliente.component';

const routes: Routes = [
  {path:'crear-cliente', component: CreateClienteComponent},
  {path: '',component: ListaClientesComponent},
  {path:'**', redirectTo:''}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomeRoutingModule { }
