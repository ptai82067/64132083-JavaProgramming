using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using Webserver.Models;

namespace Webserver.Controllers
{
    public class ValuesController : ApiController
    {
        // GET api/values
        List<Employee> employees = new List<Employee>
        {
            new Employee(1,"Phạm Phước Tài", "Leader"),
            new Employee(2,"Phạm Phước Lộc", "Backend"),
            new Employee(3,"Phạm Phước Thiện", "Fontend")

        };
        public IHttpActionResult GetEmployee()
        {
            return Ok(employees);
        }

        // GET api/values/5
        //public Employee GetEmployeeById(int id)
        //{
        //    return employees[id];
        //}
        public IHttpActionResult GetEmployeeById(int id)
        {
            var employee = employees.FirstOrDefault(e => e.Id == id);
            if (employee == null)
            {
                return NotFound();  // Trả về lỗi 404 nếu không tìm thấy nhân viên
            }
            return Ok(employee);  // Trả về kết quả nhân viên nếu tìm thấy
        }

        // POST api/values
        //public void Post([FromBody] Employee e)
        //{

        //    employees.Add(e);
        //}
        public IHttpActionResult PostEmployee([FromBody] Employee e)
        {
            if (e == null)
            {
                return BadRequest("Employee data is null.");  // Kiểm tra dữ liệu đầu vào
            }

            employees.Add(e);
            return Created($"api/values/{e.Id}", e);  // Trả về mã 201 (Created)
        }

        // PUT api/values/5
        public IHttpActionResult PutEmployee(int id, [FromBody] Employee updatedEmployee)
        {
            // Tìm kiếm nhân viên theo ID
            var employee = employees.FirstOrDefault(e => e.Id == id);
            if (employee == null)
            {
                return NotFound();  // Trả về lỗi 404 nếu không tìm thấy nhân viên
            }

            // Cập nhật thông tin nhân viên
            employee.Name = updatedEmployee.Name;
            employee.Position = updatedEmployee.Position;

            return Ok(employee);  // Trả về mã 200 (OK) kèm theo nhân viên đã được cập nhật
        }

        // DELETE api/values/5
        public IHttpActionResult DeleteEmployee(int id)
        {
            // Tìm kiếm nhân viên theo ID
            var employee = employees.FirstOrDefault(e => e.Id == id);
            if (employee == null)
            {
                return NotFound();  // Trả về lỗi 404 nếu không tìm thấy nhân viên
            }

            // Xóa nhân viên khỏi danh sách
            employees.Remove(employee);

            return Ok($"Employee with ID {id} deleted.");  // Trả về mã 200 (OK) sau khi xóa thành công
        }
    }
}
