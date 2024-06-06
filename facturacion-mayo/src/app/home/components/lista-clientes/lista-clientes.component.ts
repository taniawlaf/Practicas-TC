import { Component, OnInit } from '@angular/core';
import { ICliente } from '../../interfaces/ICliente';
import { FacturacionService } from '../../services/facturacion.service';

@Component({
  selector: 'app-lista-clientes',
  templateUrl: './lista-clientes.component.html',
  styleUrl: './lista-clientes.component.css'
})
export class ListaClientesComponent implements OnInit{
  clientes: ICliente[] = [];


  constructor(private facturacionService: FacturacionService){}

  ngOnInit(): void {
    this.obtenerClientes();
  }

  obtenerClientes(){
    this.facturacionService.getClientes().subscribe(
      (data: ICliente[]) => {
        console.log('Cargando Informacion...');
        this.clientes = data.map(
          item =>({
            id: item.id,
            nombre: item.nombre,
            numeroTelefono: item.numeroTelefono,
            diaCreacion: new Date(item.diaCreacion)
          })
        )
      }
    )
  }
}
