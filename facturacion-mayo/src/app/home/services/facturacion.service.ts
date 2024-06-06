import { Injectable } from '@angular/core';
import { enviroments } from '../../../enviroments/enviroment.prod';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ICliente } from '../interfaces/ICliente';

@Injectable({
  providedIn: 'root'
})
export class FacturacionService {

  DATAURL: string = enviroments.backURL;
  constructor(private http: HttpClient) { }

  getClientes():Observable<ICliente[]>
  {
    return this.http.get<ICliente[]>(`${this.DATAURL}/clientes`);
  }
  createCliente(cliente: ICliente):Observable<any>{
    return this.http.post(`${this.DATAURL}/guardar-cliente`,cliente)
  }
}
