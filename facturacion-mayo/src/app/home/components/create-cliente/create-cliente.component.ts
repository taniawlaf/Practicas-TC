import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { FacturacionService } from '../../services/facturacion.service';
import { ICliente } from '../../interfaces/ICliente';

@Component({
  selector: 'app-create-cliente',
  templateUrl:'./create-cliente.component.html',
  styleUrl: './create-cliente.component.css'
})


export class CreateClienteComponent implements OnInit {
  
  clienteForm!: FormGroup;

  constructor(private formBuilder: FormBuilder,
    private facturacionService: FacturacionService
  ){}
  
  ngOnInit(): void {
    this.clienteForm= this.formBuilder.group({
      nombre:['', Validators.required],
      numeroTelefono:['', Validators.required, Validators.minLength(10), Validators.maxLength(10)],
      diaCreacion:[new Date, Validators.required]
    })
  }


  onSubmit(){
    if (this.clienteForm.valid) {
      const nuevoCliente : ICliente = this.clienteForm.value;
      this.facturacionService.createCliente(nuevoCliente).subscribe(
        (response: any) => {
          console.log('Cliente agregado exitosamente: ', response);
        }
      )
    }
  }
}
